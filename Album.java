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
//        System.out.println("------------------- GetPhotos ----------------");
        photosList = new LinkedList<>();
        BST<LinkedList<Photo>> bst = manager.getPhotos();

        if (condition == null || condition.length() == 0) {
//            System.out.println("co**");
            //bst.printPreOrder(bst.getRoot());
            getAllPhotos(bst.getRoot());

        } else {
            String[] conditions = condition.trim().split(" AND ");

//            System.out.println("Conditions --> " + Arrays.toString(conditions) + " ,Length = " + conditions.length);


            for (String s : conditions) {
//                System.out.println("Condition *" + s + "*");
                if (s.length() != 0 && !bst.findKey(s)) {
                    return new LinkedList<>();
                }
                if (s.length() != 0 && bst.findKey(s)) {
                    LinkedList<Photo> photos = bst.retrieve();
//                    System.out.println(photos);
                    photos.findFirst();
                    while (photos.isThereNext()) {
                        Photo photo = photos.retrieve();
                        LinkedList<String> tagsList = photo.getTags();
                        tagsList.findFirst();
                        int counter = 0;
                        while (tagsList.isThereNext()) {
                            for (String c : conditions) {
//                                System.out.println(tagsList.retrieve().trim() + " -- " + s.trim());
//                                System.out.println(tagsList.retrieve().equals(s.trim()));
                                if (c.length() != 0 && tagsList.retrieve().trim().equals(c)) {
                                    counter++;
                                }

                            }
//                            System.out.println(conditions.length + " =----= " + counter + " =----= " + Arrays.toString(conditions));

                            if (!photosList.find(photo) && conditions.length == counter)
                                photosList.insert(photo);
                            tagsList.findNext();
                        }


                        photos.findNext();
                    }
                }
            }


        }
//        System.out.println("after Conditions  ");
        return photosList;
    }

    public void getAllPhotos(BSTNode<LinkedList<Photo>> node) {

        if (node == null)
            return;
        // now deal with the node
//        System.out.println(node.key+" :: "+node.data + " ");
        LinkedList<Photo> photos = node.data;
//                System.out.println(photos);
        photos.findFirst();
        while (photos.isThereNext()) {
            Photo photo = photos.retrieve();
            if (!photosList.find(photo)) {
//                System.out.println(node.key + " --> " + photo);
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
        return 0;
    }
}
