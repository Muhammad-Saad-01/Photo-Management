public class PhotoManager {
    LinkedList<Photo> photos;
    PhotoManager manager;

    // Constructor
    public PhotoManager() {

    }

    // Add a photo
    public void addPhoto(Photo p) {
        photos.insert(p);
    }


    // Delete a photo
    public void deletePhoto(String path) {

    }


    // Return the inverted index of all managed photos
    public BST<LinkedList<Photo>> getPhotos() {
        BST<LinkedList<Photo>> bst = new BST<>();
        bst.insert("--", photos);
        return bst;
    }

    //add to PhotoManager
    @Override
    public String toString() {
        return photos.toString();
    }


}
