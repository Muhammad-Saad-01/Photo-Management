public class PhotoManager {
    BST<LinkedList<Photo>> bst;


    // Constructor
    public PhotoManager() {
        bst = new BST<>();
    }

    // Add a photo
    public void addPhoto(Photo p) {
        LinkedList<String> tags = p.getTags();
        tags.findFirst();
        LinkedList<Photo> photosList;
        while (tags.isThereNext()) {
            String tag = tags.retrieve();

            if (bst.findKey(tag)) {
                photosList = bst.retrieve();
                photosList.insert(p);
                bst.update(tag, photosList);
            } else {
                photosList = new LinkedList<>();
                photosList.insert(p);
                bst.insert(tag, photosList);
            }

            tags.findNext();
        }

    }


    // Delete a photo
    public void deletePhoto(String path) {
        BSTNode<LinkedList<Photo>> root = bst.getRoot();
        updateNodeData(root, path);
    }

    public void updateNodeData(BSTNode<LinkedList<Photo>> node, String path) {
        LinkedList<Photo> photosList = node.data;
        photosList.findFirst();

        while (photosList.isThereNext()) {
            Photo photo = photosList.retrieve();
            if (photo.path.equals(path)) {
                photosList.remove();
            }

            if (photosList.isThereNext())
                photosList.findNext();
        }

        if (photosList.empty()) {
            bst.removeKey(node.key);
        }

        if (node.left != null) {
            updateNodeData(node.left, path);
        }
        if (node.right != null) {
            updateNodeData(node.right, path);
        }
        if (node.left == null && node.right == null) return;
    }

    // Return the inverted index of all managed photos
    public BST<LinkedList<Photo>> getPhotos() {
        return bst;
    }

    //add to PhotoManager
    @Override
    public String toString() {
        return bst.toString();
    }


}
