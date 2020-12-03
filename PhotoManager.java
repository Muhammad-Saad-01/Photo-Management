public class PhotoManager {
    BST<LinkedList<Photo>> bst;


    // Constructor
    public PhotoManager() {
        bst = new BST<>();
    }

    // Add a photo
    public void addPhoto(Photo p) {
        p.tags.findFirst();
        System.out.println(p.tags);
        LinkedList<Photo> photosList;

        while (!p.tags.isThereNext()) {
            String tag = p.tags.retrieve();

            if (bst.findKey(tag)) {
                photosList = bst.retrieve();
                photosList.insert(p);
                bst.update(tag,photosList);
            } else {
                photosList = new LinkedList<>();
                photosList.insert(p);
                bst.insert(tag, photosList);
            }


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
