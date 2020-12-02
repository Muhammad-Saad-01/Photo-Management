public class Main {
    public static void main(String[] args) {
        BST<String> bst = new BST<>();
        bst.insert("1", "M");
        bst.insert("2", "M");
        bst.insert("3", "M");
        bst.insert("4", "M");
        bst.insert("5", "M");
        bst.insert("6", "M");
        bst.insert("7", "M");
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(10);
        list.insert(5);
        list.insert(25);
        list.update(7);
        list.findFirst();
        list.findNext();
        System.out.println(list.retrieve());

        LinkedList<String> animalsList = new LinkedList<>();
        animalsList.insert("dog");
        animalsList.insert("cat");
        animalsList.insert("donkey");
        animalsList.insert("monkey");

        LinkedList<LinkedList<String>> tagsList = new LinkedList<>();

        tagsList.insert(animalsList);
        tagsList.insert(animalsList);
        tagsList.insert(animalsList);
        System.out.println(tagsList);
        Photo a = new Photo("cat.png", animalsList);
        Photo b = new Photo("dog.png", animalsList);
        Photo c = new Photo("monkey.png", animalsList);
        Photo d = new Photo("donkey.png", animalsList);

        PhotoManager pm = testAdd();
        /*testDelete();
        testGetPhotos(pm);*/


    }

    //these are some simple test cases that cover the basic utility of the PA



    private static void testGetPhotos(PhotoManager pm) {
        Album a = new Album("A", "", pm);
        System.out.println(a.getPhotos());

        Album b = new Album("B", "bear", pm);
        System.out.println(b.getPhotos());
//
        Album ag = new Album("ab", "animal AND grass", pm);
        System.out.println(ag.getPhotos());

        ag = new Album("ab2", "grass AND animal", pm);
        System.out.println(ag.getPhotos());
//
        Album e = new Album("R", "fsdfg", pm);
        System.out.println(e.getPhotos());

        e = new Album("R2", "grass AND fsdfg", pm);
        System.out.println(e.getPhotos());

        Album s = new Album("R", "snow AND bear", pm);
        System.out.println(s.getPhotos());
//
    }

    private static PhotoManager testAdd() {

        PhotoManager pm = new PhotoManager();
        pm.addPhoto(creatPhoto("hedgehog.jpg", "animal", "hedgehog", "apple", "grass", "green"));
        pm.addPhoto(creatPhoto("bear.jpg", "animal", "bear", "cub", "grass", "wind"));
        pm.addPhoto(creatPhoto("butterfly1.jpg", "insect", "butterfly", "flower", "color"));
        pm.addPhoto(creatPhoto("butterfly2.jpg", "insect", "butterfly", "flower", "black"));
        pm.addPhoto(creatPhoto("fox.jpg", "animal", "fox", "tree", "forest", "grass"));
        pm.addPhoto(creatPhoto("panda.jpg", "animal", "bear", "panda", "grass"));
        pm.addPhoto(creatPhoto("wolf.jpg", "animal", "wolf", "mountain", "sky", "snow", "cloud"));
        pm.addPhoto(creatPhoto("raccoon.jpg", "animal", "raccoon", "log", "snow"));

        Print(pm);
        return pm;
    }

    private static Photo creatPhoto(String path, String... tags) {
        LinkedList<String> ll = new LinkedList<String>();
        for (String string : tags) {
            ll.insert(string);
        }
        return new Photo(path, ll);
    }

    private static void testDelete() {

        PhotoManager pm = new PhotoManager();

        LinkedList<String> ll = new LinkedList<String>();
        ll.insert("Foxtrot");
        ll.insert("Tango");
        ll.insert("Charlie");
        pm.addPhoto(new Photo("x", ll));

        LinkedList<String> ll2 = new LinkedList<String>();
        ll2.insert("Foxtrot");
        ll2.insert("3");
        pm.addPhoto(new Photo("y", ll2));

        System.out.println("deleting x");
        Print(pm);

        pm.deletePhoto("x");

        System.out.println("deleting non-existing");
        Print(pm);

        pm.deletePhoto("y");

        System.out.println("deleting y");
        Print(pm);
    }

    private static void Print(PhotoManager pm) {
        System.out.println("========================");
        System.out.println(pm);
        System.out.println("========================");

    }

}


