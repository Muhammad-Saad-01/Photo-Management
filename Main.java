public class Main {
    public static void main(String[] args) {

        PhotoManager pm = testAdd();
        testDelete();
        testGetPhotos(pm);


    }

    //these are some simple test cases that cover the basic utility of the PA


    private static void testGetPhotos(PhotoManager pm) {
        System.out.println("****Album 1****");
        Album a = new Album("A", "", pm);
        System.out.println(a.getPhotos());
        System.out.println(a.getNbComps());

        System.out.println("****Album 2****");
        Album b = new Album("B", "bear", pm);
        System.out.println(b.getPhotos());
        System.out.println(b.getNbComps());

        System.out.println("****Album 3****");
        Album ag = new Album("ab", "animal AND grass", pm);
        System.out.println(ag.getPhotos());
        System.out.println(ag.getNbComps());

        System.out.println("****Album 4****");
        ag = new Album("ab2", "grass AND animal", pm);
        System.out.println(ag.getPhotos());
        System.out.println(ag.getNbComps());

        System.out.println("****Album 5****");
        Album e = new Album("R", "fsdfg", pm);
        System.out.println(e.getPhotos());
        System.out.println(e.getNbComps());

        System.out.println("****Album 6****");
        e = new Album("R2", "grass AND fsdfg", pm);
        System.out.println(e.getPhotos());
        System.out.println(e.getNbComps());

        System.out.println("****Album 7****");
        Album s = new Album("R", "snow AND bear", pm);
        System.out.println(s.getPhotos());
        System.out.println(s.getNbComps());

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


