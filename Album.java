import java.util.Arrays;

public class Album {
    String name, condition;
    PhotoManager manager;
    int numberOfComparisons = 0;
    LinkedList<Photo> photosList;

    // Constructor
    public Album(String name, String condition, PhotoManager manager) {
        this.name = name;
        this.condition = condition;
        this.manager = manager;
        photosList = new LinkedList<>();
        numberOfComparisons = 0;
    }

    // Return the name of the album
    public String getName() {
        return name;
    }

    // Return the condition associated with the album
    public String getCondition() {
        return condition;
    }

    // Return the manager
    public PhotoManager getManager() {
        return manager;
    }

    // Return all photos that satisfy the album condition
    public LinkedList<Photo> getPhotos() {
        photosList = new LinkedList<>();
        BST<LinkedList<Photo>> bst = manager.getPhotos();

        if (condition == null || condition.length() == 0) {
            getAllPhotos(bst.getRoot());

        } else {
            String[] conditions = condition.trim().split(" AND ");


            for (String s : conditions) {
                if (s.length() != 0 && !bst.findKey(s)) {
                    return new LinkedList<>();
                }
                if (s.length() != 0 && bst.findKey(s)) {
                    numberOfComparisons =+ bst.getNumberOfComparisons();
                    LinkedList<Photo> photos = bst.retrieve();
                    photos.findFirst();
                    while (photos.isThereNext()) {
                        Photo photo = photos.retrieve();
                        LinkedList<String> tagsList = photo.getTags();
                        tagsList.findFirst();
                        int counter = 0;
                        while (tagsList.isThereNext()) {
                            for (String c : conditions) {
                                if (c.length() != 0 && tagsList.retrieve().trim().equals(c)) {
                                    counter++;
                                }
                            }

                            if (!photosList.find(photo) && conditions.length == counter)
                                photosList.insert(photo);
                            tagsList.findNext();
                        }

                        photos.findNext();
                    }
                }
            }


        }
        return photosList;
    }

    public void getAllPhotos(BSTNode<LinkedList<Photo>> node) {

        if (node == null)
            return;

        LinkedList<Photo> photos = node.data;
        photos.findFirst();
        while (photos.isThereNext()) {
            Photo photo = photos.retrieve();
            if (!photosList.find(photo)) {
                photosList.insert(photo);
            }

            photos.findNext();
        }

        // first recur on left subtree
        getAllPhotos(node.left);

        // then recur on right subtree
        getAllPhotos(node.right);
    }


    // Return the number of tag comparisons used to find all photos of the album
    public int getNbComps() {
        return numberOfComparisons;
    }
}
