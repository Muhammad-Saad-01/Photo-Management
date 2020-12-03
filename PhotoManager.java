public class PhotoManager {
    BST<LinkedList<Photo>> bst;
    LinkedList<Photo> photosList;

    // Constructor
    public PhotoManager() {
        bst = new BST<>();
        photosList = new LinkedList<>();
    }

    // Add a photo
    public void addPhoto(Photo p) {
        p.tags.findFirst();
        System.out.println(p.tags);
        while (!p.tags.last()) {
            String tag = p.tags.retrieve();
            photosList.insert(p);
            bst.insert(tag, photosList);
            System.out.println(tag);

            p.tags.findNext();
        }
    }


    // Delete a photo
    public void deletePhoto(String path) {

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
