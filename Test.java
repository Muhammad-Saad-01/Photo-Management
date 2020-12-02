class Test1 {

    public static void main(String[] args) {

        LinkedList<String> tag1 = new LinkedList<String>();
        tag1.insert("animal");
        tag1.insert("apple");
        tag1.insert("grass");
        tag1.insert("headgehog");

        LinkedList<String> tag2 = new LinkedList<String>();
        tag2.insert("bear");
        tag2.insert("cub");
        tag2.insert("animal");
        tag2.insert("grass");

        LinkedList<String> tag3 = new LinkedList<String>();
        tag3.insert("butterfly");
        tag3.insert("flower");
        tag3.insert("insect");
        tag3.insert("color");

        LinkedList<String> tag4 = new LinkedList<String>();
        tag4.insert("insect");
        tag4.insert("butterfly");
        tag4.insert("flower");
        tag4.insert("black");

        LinkedList<String> tag5 = new LinkedList<String>();
        tag5.insert("animal");
        tag5.insert("fox");
        tag5.insert("tree");
        tag5.insert("grass");

        LinkedList<String> tag6 = new LinkedList<String>();
        tag6.insert("animal");
        tag6.insert("bear");
        tag6.insert("panda");
        tag6.insert("grass");

        LinkedList<String> tag7 = new LinkedList<String>();
        tag7.insert("animal");
        tag7.insert("wolf");
        tag7.insert("sky");
        tag7.insert("snow");

        LinkedList<String> tag8 = new LinkedList<String>();
        tag8.insert("animal");
        tag8.insert("raccoon");
        tag8.insert("log");
        tag8.insert("snow");

        Photo p1 = new Photo("hedgehog.jpg", tag1);
        Photo p2 = new Photo("bear.jpg", tag2);
        Photo p3 = new Photo("butterfly1.jpg", tag3);
        Photo p4 = new Photo("butterfly2.jpg", tag4);
        Photo p5 = new Photo("fox.jpg", tag5);
        Photo p6 = new Photo("panda.jpg", tag6);
        Photo p7 = new Photo("wolf.jpg", tag7);
        Photo p8 = new Photo("raccoon.jpg", tag8);

        PhotoManager pm = new PhotoManager();

        pm.addPhoto(p1);
        pm.addPhoto(p2);
        pm.addPhoto(p3);
        pm.addPhoto(p4);
        pm.addPhoto(p5);
        pm.addPhoto(p6);
        pm.addPhoto(p7);
        pm.addPhoto(p8);

        Album a = new Album("bears", "insect", pm);

        System.out.println(a.getNbComps());
    }
}

/*
OUTPUT: 5

        ----------------------------------------------------------------------------------------------------------------------------------------
*/

class Test2 {

    public static void main(String[] args) {

        LinkedList<String> tag1 = new LinkedList<String>();
        tag1.insert("animal");
        tag1.insert("apple");
        tag1.insert("grass");
        tag1.insert("headgehog");

        LinkedList<String> tag2 = new LinkedList<String>();
        tag2.insert("bear");
        tag2.insert("cub");
        tag2.insert("animal");
        tag2.insert("grass");

        LinkedList<String> tag3 = new LinkedList<String>();
        tag3.insert("butterfly");
        tag3.insert("flower");
        tag3.insert("insect");
        tag3.insert("color");

        LinkedList<String> tag4 = new LinkedList<String>();
        tag4.insert("insect");
        tag4.insert("butterfly");
        tag4.insert("flower");
        tag4.insert("black");

        LinkedList<String> tag5 = new LinkedList<String>();
        tag5.insert("animal");
        tag5.insert("fox");
        tag5.insert("tree");
        tag5.insert("grass");

        LinkedList<String> tag6 = new LinkedList<String>();
        tag6.insert("animal");
        tag6.insert("bear");
        tag6.insert("panda");
        tag6.insert("grass");

        LinkedList<String> tag7 = new LinkedList<String>();
        tag7.insert("animal");
        tag7.insert("wolf");
        tag7.insert("sky");
        tag7.insert("snow");

        LinkedList<String> tag8 = new LinkedList<String>();
        tag8.insert("animal");
        tag8.insert("raccoon");
        tag8.insert("log");
        tag8.insert("snow");

        Photo p1 = new Photo("hedgehog.jpg", tag1);
        Photo p2 = new Photo("bear.jpg", tag2);
        Photo p3 = new Photo("butterfly1.jpg", tag3);
        Photo p4 = new Photo("butterfly2.jpg", tag4);
        Photo p5 = new Photo("fox.jpg", tag5);
        Photo p6 = new Photo("panda.jpg", tag6);
        Photo p7 = new Photo("wolf.jpg", tag7);
        Photo p8 = new Photo("raccoon.jpg", tag8);

        PhotoManager pm = new PhotoManager();

        pm.addPhoto(p1);
        pm.addPhoto(p2);
        pm.addPhoto(p3);
        pm.addPhoto(p4);
        pm.addPhoto(p5);
        pm.addPhoto(p6);
        pm.addPhoto(p7);
        pm.addPhoto(p8);

        Album a = new Album("bears", "insect AND black", pm);

        System.out.println(a.getNbComps());
    }
}
/*

OUTPUT:12

        ----------------------------------------------------------------------------------------------------------------------------------------
*/

class Test3 {

    public static void main(String[] args) {

        LinkedList<String> tag1 = new LinkedList<String>();
        tag1.insert("animal");
        tag1.insert("apple");
        tag1.insert("grass");
        tag1.insert("headgehog");

        LinkedList<String> tag2 = new LinkedList<String>();
        tag2.insert("bear");
        tag2.insert("cub");
        tag2.insert("animal");
        tag2.insert("grass");

        LinkedList<String> tag3 = new LinkedList<String>();
        tag3.insert("butterfly");
        tag3.insert("flower");
        tag3.insert("insect");
        tag3.insert("color");

        LinkedList<String> tag4 = new LinkedList<String>();
        tag4.insert("insect");
        tag4.insert("butterfly");
        tag4.insert("flower");
        tag4.insert("black");

        LinkedList<String> tag5 = new LinkedList<String>();
        tag5.insert("animal");
        tag5.insert("fox");
        tag5.insert("tree");
        tag5.insert("grass");

        LinkedList<String> tag6 = new LinkedList<String>();
        tag6.insert("animal");
        tag6.insert("bear");
        tag6.insert("panda");
        tag6.insert("grass");

        LinkedList<String> tag7 = new LinkedList<String>();
        tag7.insert("animal");
        tag7.insert("wolf");
        tag7.insert("sky");
        tag7.insert("snow");

        LinkedList<String> tag8 = new LinkedList<String>();
        tag8.insert("animal");
        tag8.insert("raccoon");
        tag8.insert("log");
        tag8.insert("snow");

        Photo p1 = new Photo("hedgehog.jpg", tag1);
        Photo p2 = new Photo("bear.jpg", tag2);
        Photo p3 = new Photo("butterfly1.jpg", tag3);
        Photo p4 = new Photo("butterfly2.jpg", tag4);
        Photo p5 = new Photo("fox.jpg", tag5);
        Photo p6 = new Photo("panda.jpg", tag6);
        Photo p7 = new Photo("wolf.jpg", tag7);
        Photo p8 = new Photo("raccoon.jpg", tag8);

        PhotoManager pm = new PhotoManager();

        pm.addPhoto(p1);
        pm.addPhoto(p2);
        pm.addPhoto(p3);
        pm.addPhoto(p4);
        pm.addPhoto(p5);
        pm.addPhoto(p6);
        pm.addPhoto(p7);
        pm.addPhoto(p8);

        Album a = new Album("bears", "bear AND grass", pm);

        System.out.println(a.getNbComps());
    }
}

/*
OUTPUT: 7
        ---------------------------------------------------------------------------------------------------------

*/

class Test4 {

    public static void main(String[] args) {

        LinkedList<String> tag1 = new LinkedList<String>();
        tag1.insert("grass");
        tag1.insert("animal");
        tag1.insert("apple");
        tag1.insert("headgehog");

        LinkedList<String> tag2 = new LinkedList<String>();
        tag2.insert("cub");
        tag2.insert("animal");
        tag2.insert("bear");
        tag2.insert("grass");

        LinkedList<String> tag3 = new LinkedList<String>();
        tag3.insert("butterfly");
        tag3.insert("flower");
        tag3.insert("insect");
        tag3.insert("color");

        LinkedList<String> tag4 = new LinkedList<String>();
        tag4.insert("insect");
        tag4.insert("butterfly");
        tag4.insert("flower");
        tag4.insert("black");

        LinkedList<String> tag5 = new LinkedList<String>();
        tag5.insert("animal");
        tag5.insert("fox");
        tag5.insert("tree");
        tag5.insert("grass");

        LinkedList<String> tag6 = new LinkedList<String>();
        tag6.insert("animal");
        tag6.insert("bear");
        tag6.insert("panda");
        tag6.insert("grass");

        LinkedList<String> tag7 = new LinkedList<String>();
        tag7.insert("animal");
        tag7.insert("wolf");
        tag7.insert("sky");
        tag7.insert("snow");

        LinkedList<String> tag8 = new LinkedList<String>();
        tag8.insert("animal");
        tag8.insert("raccoon");
        tag8.insert("log");
        tag8.insert("snow");

        Photo p1 = new Photo("hedgehog.jpg", tag1);
        Photo p2 = new Photo("bear.jpg", tag2);
        Photo p3 = new Photo("butterfly1.jpg", tag3);
        Photo p4 = new Photo("butterfly2.jpg", tag4);
        Photo p5 = new Photo("fox.jpg", tag5);
        Photo p6 = new Photo("panda.jpg", tag6);
        Photo p7 = new Photo("wolf.jpg", tag7);
        Photo p8 = new Photo("raccoon.jpg", tag8);

        PhotoManager pm = new PhotoManager();

        pm.addPhoto(p1);
        pm.addPhoto(p2);
        pm.addPhoto(p3);
        pm.addPhoto(p4);
        pm.addPhoto(p5);
        pm.addPhoto(p6);
        pm.addPhoto(p7);
        pm.addPhoto(p8);

        Album a = new Album("bears", "bear AND grass", pm);

        System.out.println(a.getNbComps());
    }
}

/*
OUTPUT: 6

        ----------------------------------------------------------------------------------------
*/


class Test5 {

    public static void main(String[] args) {

        LinkedList<String> tag1 = new LinkedList<String>();
        tag1.insert("grass");
        tag1.insert("apple");
        tag1.insert("animal");
        tag1.insert("headgehog");

        LinkedList<String> tag2 = new LinkedList<String>();
        tag2.insert("bear");
        tag2.insert("cub");
        tag2.insert("animal");
        tag2.insert("grass");

        LinkedList<String> tag3 = new LinkedList<String>();
        tag3.insert("butterfly");
        tag3.insert("flower");
        tag3.insert("insect");
        tag3.insert("color");

        LinkedList<String> tag4 = new LinkedList<String>();
        tag4.insert("insect");
        tag4.insert("butterfly");
        tag4.insert("flower");
        tag4.insert("black");

        LinkedList<String> tag5 = new LinkedList<String>();
        tag5.insert("animal");
        tag5.insert("fox");
        tag5.insert("tree");
        tag5.insert("grass");

        LinkedList<String> tag6 = new LinkedList<String>();
        tag6.insert("animal");
        tag6.insert("bear");
        tag6.insert("panda");
        tag6.insert("grass");

        LinkedList<String> tag7 = new LinkedList<String>();
        tag7.insert("animal");
        tag7.insert("wolf");
        tag7.insert("sky");
        tag7.insert("snow");

        LinkedList<String> tag8 = new LinkedList<String>();
        tag8.insert("animal");
        tag8.insert("raccoon");
        tag8.insert("log");
        tag8.insert("snow");

        Photo p1 = new Photo("hedgehog.jpg", tag1);
        Photo p2 = new Photo("bear.jpg", tag2);
        Photo p3 = new Photo("butterfly1.jpg", tag3);
        Photo p4 = new Photo("butterfly2.jpg", tag4);
        Photo p5 = new Photo("fox.jpg", tag5);
        Photo p6 = new Photo("panda.jpg", tag6);
        Photo p7 = new Photo("wolf.jpg", tag7);
        Photo p8 = new Photo("raccoon.jpg", tag8);

        PhotoManager pm = new PhotoManager();

        pm.addPhoto(p1);
        pm.addPhoto(p2);
        pm.addPhoto(p3);
        pm.addPhoto(p4);
        pm.addPhoto(p5);
        pm.addPhoto(p6);
        pm.addPhoto(p7);
        pm.addPhoto(p8);

        Album a = new Album("bears", "bear AND grass AND animal", pm);

        System.out.println(a.getNbComps());
    }
}

/*
OUTPUT: 7

        ----------------------------------------------------------------------------------
*/

class Test6 {

    public static void main(String[] args) {

        LinkedList<String> tag1 = new LinkedList<String>();
        tag1.insert("animal");
        tag1.insert("apple");
        tag1.insert("grass");
        tag1.insert("headgehog");

        LinkedList<String> tag2 = new LinkedList<String>();
        tag2.insert("bear");
        tag2.insert("cub");
        tag2.insert("animal");
        tag2.insert("grass");

        LinkedList<String> tag3 = new LinkedList<String>();
        tag3.insert("butterfly");
        tag3.insert("flower");
        tag3.insert("insect");
        tag3.insert("color");

        LinkedList<String> tag4 = new LinkedList<String>();
        tag4.insert("insect");
        tag4.insert("butterfly");
        tag4.insert("flower");
        tag4.insert("black");

        LinkedList<String> tag5 = new LinkedList<String>();
        tag5.insert("animal");
        tag5.insert("fox");
        tag5.insert("tree");
        tag5.insert("grass");

        LinkedList<String> tag6 = new LinkedList<String>();
        tag6.insert("animal");
        tag6.insert("bear");
        tag6.insert("panda");
        tag6.insert("grass");

        LinkedList<String> tag7 = new LinkedList<String>();
        tag7.insert("animal");
        tag7.insert("wolf");
        tag7.insert("sky");
        tag7.insert("snow");

        LinkedList<String> tag8 = new LinkedList<String>();
        tag8.insert("animal");
        tag8.insert("raccoon");
        tag8.insert("log");
        tag8.insert("snow");

        Photo p1 = new Photo("hedgehog.jpg", tag1);
        Photo p2 = new Photo("bear.jpg", tag2);
        Photo p3 = new Photo("butterfly1.jpg", tag3);
        Photo p4 = new Photo("butterfly2.jpg", tag4);
        Photo p5 = new Photo("fox.jpg", tag5);
        Photo p6 = new Photo("panda.jpg", tag6);
        Photo p7 = new Photo("wolf.jpg", tag7);
        Photo p8 = new Photo("raccoon.jpg", tag8);

        PhotoManager pm = new PhotoManager();

        pm.addPhoto(p1);
        pm.addPhoto(p2);
        pm.addPhoto(p3);
        pm.addPhoto(p4);
        pm.addPhoto(p5);
        pm.addPhoto(p6);
        pm.addPhoto(p7);
        pm.addPhoto(p8);

        Album a = new Album("bears", "insect", pm);

        System.out.println(a.getNbComps());
    }
}

/*
OUTPUT: 6

        ----------------------------------------------------------------------------------------------------------------------------------------
*/

class Test7 {

    public static void main(String[] args) {

        LinkedList<String> tag1 = new LinkedList<String>();
        tag1.insert("animal");
        tag1.insert("apple");
        tag1.insert("grass");
        tag1.insert("headgehog");

        LinkedList<String> tag2 = new LinkedList<String>();
        tag2.insert("bear");
        tag2.insert("cub");
        tag2.insert("animal");
        tag2.insert("grass");

        LinkedList<String> tag3 = new LinkedList<String>();
        tag3.insert("butterfly");
        tag3.insert("flower");
        tag3.insert("insect");
        tag3.insert("color");

        LinkedList<String> tag4 = new LinkedList<String>();
        tag4.insert("insect");
        tag4.insert("butterfly");
        tag4.insert("flower");
        tag4.insert("black");

        LinkedList<String> tag5 = new LinkedList<String>();
        tag5.insert("animal");
        tag5.insert("fox");
        tag5.insert("tree");
        tag5.insert("grass");

        LinkedList<String> tag6 = new LinkedList<String>();
        tag6.insert("animal");
        tag6.insert("bear");
        tag6.insert("panda");
        tag6.insert("grass");

        LinkedList<String> tag7 = new LinkedList<String>();
        tag7.insert("animal");
        tag7.insert("wolf");
        tag7.insert("sky");
        tag7.insert("snow");

        LinkedList<String> tag8 = new LinkedList<String>();
        tag8.insert("animal");
        tag8.insert("raccoon");
        tag8.insert("log");
        tag8.insert("snow");

        Photo p1 = new Photo("hedgehog.jpg", tag1);
        Photo p2 = new Photo("bear.jpg", tag2);
        Photo p3 = new Photo("butterfly1.jpg", tag3);
        Photo p4 = new Photo("butterfly2.jpg", tag4);
        Photo p5 = new Photo("fox.jpg", tag5);
        Photo p6 = new Photo("panda.jpg", tag6);
        Photo p7 = new Photo("wolf.jpg", tag7);
        Photo p8 = new Photo("raccoon.jpg", tag8);

        PhotoManager pm = new PhotoManager();

        pm.addPhoto(p1);
        pm.addPhoto(p2);
        pm.addPhoto(p3);
        pm.addPhoto(p4);
        pm.addPhoto(p5);
        pm.addPhoto(p6);
        pm.addPhoto(p7);
        pm.addPhoto(p8);

        Album a = new Album("bears", "insect AND black", pm);

        System.out.println(a.getNbComps());
    }
}
/*

OUTPUT:14

        ----------------------------------------------------------------------------------------------------------------------------------------
*/

class Test8 {

    public static void main(String[] args) {

        LinkedList<String> tag1 = new LinkedList<String>();
        tag1.insert("animal");
        tag1.insert("apple");
        tag1.insert("grass");
        tag1.insert("headgehog");

        LinkedList<String> tag2 = new LinkedList<String>();
        tag2.insert("bear");
        tag2.insert("cub");
        tag2.insert("animal");
        tag2.insert("grass");

        LinkedList<String> tag3 = new LinkedList<String>();
        tag3.insert("butterfly");
        tag3.insert("flower");
        tag3.insert("insect");
        tag3.insert("color");

        LinkedList<String> tag4 = new LinkedList<String>();
        tag4.insert("insect");
        tag4.insert("butterfly");
        tag4.insert("flower");
        tag4.insert("black");

        LinkedList<String> tag5 = new LinkedList<String>();
        tag5.insert("animal");
        tag5.insert("fox");
        tag5.insert("tree");
        tag5.insert("grass");

        LinkedList<String> tag6 = new LinkedList<String>();
        tag6.insert("animal");
        tag6.insert("bear");
        tag6.insert("panda");
        tag6.insert("grass");

        LinkedList<String> tag7 = new LinkedList<String>();
        tag7.insert("animal");
        tag7.insert("wolf");
        tag7.insert("sky");
        tag7.insert("snow");

        LinkedList<String> tag8 = new LinkedList<String>();
        tag8.insert("animal");
        tag8.insert("raccoon");
        tag8.insert("log");
        tag8.insert("snow");

        Photo p1 = new Photo("hedgehog.jpg", tag1);
        Photo p2 = new Photo("bear.jpg", tag2);
        Photo p3 = new Photo("butterfly1.jpg", tag3);
        Photo p4 = new Photo("butterfly2.jpg", tag4);
        Photo p5 = new Photo("fox.jpg", tag5);
        Photo p6 = new Photo("panda.jpg", tag6);
        Photo p7 = new Photo("wolf.jpg", tag7);
        Photo p8 = new Photo("raccoon.jpg", tag8);

        PhotoManager pm = new PhotoManager();

        pm.addPhoto(p1);
        pm.addPhoto(p2);
        pm.addPhoto(p3);
        pm.addPhoto(p4);
        pm.addPhoto(p5);
        pm.addPhoto(p6);
        pm.addPhoto(p7);
        pm.addPhoto(p8);

        Album a = new Album("bears", "bear AND grass", pm);

        System.out.println(a.getNbComps());
    }
}

/*
OUTPUT: 9
        ---------------------------------------------------------------------------------------------------------
*/


class Test9 {

    public static void main(String[] args) {

        LinkedList<String> tag1 = new LinkedList<String>();
        tag1.insert("grass");
        tag1.insert("animal");
        tag1.insert("apple");
        tag1.insert("headgehog");

        LinkedList<String> tag2 = new LinkedList<String>();
        tag2.insert("cub");
        tag2.insert("animal");
        tag2.insert("bear");
        tag2.insert("grass");

        LinkedList<String> tag3 = new LinkedList<String>();
        tag3.insert("butterfly");
        tag3.insert("flower");
        tag3.insert("insect");
        tag3.insert("color");

        LinkedList<String> tag4 = new LinkedList<String>();
        tag4.insert("insect");
        tag4.insert("butterfly");
        tag4.insert("flower");
        tag4.insert("black");

        LinkedList<String> tag5 = new LinkedList<String>();
        tag5.insert("animal");
        tag5.insert("fox");
        tag5.insert("tree");
        tag5.insert("grass");

        LinkedList<String> tag6 = new LinkedList<String>();
        tag6.insert("animal");
        tag6.insert("bear");
        tag6.insert("panda");
        tag6.insert("grass");

        LinkedList<String> tag7 = new LinkedList<String>();
        tag7.insert("animal");
        tag7.insert("wolf");
        tag7.insert("sky");
        tag7.insert("snow");

        LinkedList<String> tag8 = new LinkedList<String>();
        tag8.insert("animal");
        tag8.insert("raccoon");
        tag8.insert("log");
        tag8.insert("snow");

        Photo p1 = new Photo("hedgehog.jpg", tag1);
        Photo p2 = new Photo("bear.jpg", tag2);
        Photo p3 = new Photo("butterfly1.jpg", tag3);
        Photo p4 = new Photo("butterfly2.jpg", tag4);
        Photo p5 = new Photo("fox.jpg", tag5);
        Photo p6 = new Photo("panda.jpg", tag6);
        Photo p7 = new Photo("wolf.jpg", tag7);
        Photo p8 = new Photo("raccoon.jpg", tag8);

        PhotoManager pm = new PhotoManager();

        pm.addPhoto(p1);
        pm.addPhoto(p2);
        pm.addPhoto(p3);
        pm.addPhoto(p4);
        pm.addPhoto(p5);
        pm.addPhoto(p6);
        pm.addPhoto(p7);
        pm.addPhoto(p8);

        Album a = new Album("bears", "bear AND grass", pm);

        System.out.println(a.getNbComps());
    }
}

/*
OUTPUT: 8

        ----------------------------------------------------------------------------------------

*/

class Test10 {

    public static void main(String[] args) {

        LinkedList<String> tag1 = new LinkedList<String>();
        tag1.insert("grass");
        tag1.insert("apple");
        tag1.insert("animal");
        tag1.insert("headgehog");

        LinkedList<String> tag2 = new LinkedList<String>();
        tag2.insert("bear");
        tag2.insert("cub");
        tag2.insert("animal");
        tag2.insert("grass");

        LinkedList<String> tag3 = new LinkedList<String>();
        tag3.insert("butterfly");
        tag3.insert("flower");
        tag3.insert("insect");
        tag3.insert("color");

        LinkedList<String> tag4 = new LinkedList<String>();
        tag4.insert("insect");
        tag4.insert("butterfly");
        tag4.insert("flower");
        tag4.insert("black");

        LinkedList<String> tag5 = new LinkedList<String>();
        tag5.insert("animal");
        tag5.insert("fox");
        tag5.insert("tree");
        tag5.insert("grass");

        LinkedList<String> tag6 = new LinkedList<String>();
        tag6.insert("animal");
        tag6.insert("bear");
        tag6.insert("panda");
        tag6.insert("grass");

        LinkedList<String> tag7 = new LinkedList<String>();
        tag7.insert("animal");
        tag7.insert("wolf");
        tag7.insert("sky");
        tag7.insert("snow");

        LinkedList<String> tag8 = new LinkedList<String>();
        tag8.insert("animal");
        tag8.insert("raccoon");
        tag8.insert("log");
        tag8.insert("snow");

        Photo p1 = new Photo("hedgehog.jpg", tag1);
        Photo p2 = new Photo("bear.jpg", tag2);
        Photo p3 = new Photo("butterfly1.jpg", tag3);
        Photo p4 = new Photo("butterfly2.jpg", tag4);
        Photo p5 = new Photo("fox.jpg", tag5);
        Photo p6 = new Photo("panda.jpg", tag6);
        Photo p7 = new Photo("wolf.jpg", tag7);
        Photo p8 = new Photo("raccoon.jpg", tag8);

        PhotoManager pm = new PhotoManager();

        pm.addPhoto(p1);
        pm.addPhoto(p2);
        pm.addPhoto(p3);
        pm.addPhoto(p4);
        pm.addPhoto(p5);
        pm.addPhoto(p6);
        pm.addPhoto(p7);
        pm.addPhoto(p8);

        Album a = new Album("bears", "bear AND grass AND animal", pm);

        System.out.println(a.getNbComps());
    }
}
/*

OUTPUT: 10

        -----------------------------------------------------------------------------------------------
*/

class Test11 {

    public static void main(String[] args) {

        LinkedList<String> tag1 = new LinkedList<String>();
        tag1.insert("animal");
        tag1.insert("headgehog");
        tag1.insert("apple");
        tag1.insert("grass");

        LinkedList<String> tag2 = new LinkedList<String>();
        tag2.insert("animal");
        tag2.insert("bear");
        tag2.insert("cub");
        tag2.insert("grass");

        LinkedList<String> tag3 = new LinkedList<String>();
        tag3.insert("insect");
        tag3.insert("butterfly");
        tag3.insert("flower");
        tag3.insert("color");

        LinkedList<String> tag4 = new LinkedList<String>();
        tag4.insert("insect");
        tag4.insert("butterfly");
        tag4.insert("flower");
        tag4.insert("black");

        LinkedList<String> tag5 = new LinkedList<String>();
        tag5.insert("animal");
        tag5.insert("fox");
        tag5.insert("tree");
        tag5.insert("grass");

        LinkedList<String> tag6 = new LinkedList<String>();
        tag6.insert("animal");
        tag6.insert("bear");
        tag6.insert("panda");
        tag6.insert("grass");

        LinkedList<String> tag7 = new LinkedList<String>();
        tag7.insert("animal");
        tag7.insert("wolf");
        tag7.insert("sky");
        tag7.insert("snow");

        LinkedList<String> tag8 = new LinkedList<String>();
        tag8.insert("animal");
        tag8.insert("raccoon");
        tag8.insert("log");
        tag8.insert("snow");

        Photo p1 = new Photo("hedgehog.jpg", tag1);
        Photo p2 = new Photo("bear.jpg", tag2);
        Photo p3 = new Photo("butterfly1.jpg", tag3);
        Photo p4 = new Photo("butterfly2.jpg", tag4);
        Photo p5 = new Photo("fox.jpg", tag5);
        Photo p6 = new Photo("panda.jpg", tag6);
        Photo p7 = new Photo("wolf.jpg", tag7);
        Photo p8 = new Photo("raccoon.jpg", tag8);

        PhotoManager pm = new PhotoManager();

        pm.addPhoto(p1);
        pm.addPhoto(p2);
        pm.addPhoto(p3);
        pm.addPhoto(p4);
        pm.addPhoto(p5);
        pm.addPhoto(p6);
        pm.addPhoto(p7);
        pm.addPhoto(p8);

        Album a = new Album("bears", "bear", pm);

        LinkedList<Photo> PhotosOfA = a.getPhotos();

        if (!PhotosOfA.empty()) {

            PhotosOfA.findFirst();

            while (!PhotosOfA.last()) {

                System.out.println(PhotosOfA.retrieve().getPath());
                PhotosOfA.findNext();

            }

            System.out.println(PhotosOfA.retrieve().getPath());

        } else {

            System.out.println("No Photos");
        }
        System.out.println("----------------------------------------");

        pm.deletePhoto("panda.jpg");

        PhotosOfA = a.getPhotos();

        if (!PhotosOfA.empty()) {

            PhotosOfA.findFirst();

            while (!PhotosOfA.last()) {

                System.out.println(PhotosOfA.retrieve().getPath());
                PhotosOfA.findNext();

            }

            System.out.println(PhotosOfA.retrieve().getPath());

        } else {

            System.out.println("No Photos");
        }
    }

}
/*


OUTPUT:
        bear.jpg
        panda.jpg
        ----------------------------------------
        bear.jpg


        ---------------------------------------------------------------------------------------------------------------------------------------
*/



class Test12 {

    public static void main(String[] args) {

        LinkedList<String> tag1 = new LinkedList<String>();
        tag1.insert("animal");
        tag1.insert("headgehog");
        tag1.insert("apple");
        tag1.insert("grass");

        LinkedList<String> tag2 = new LinkedList<String>();
        tag2.insert("animal");
        tag2.insert("bear");
        tag2.insert("cub");
        tag2.insert("grass");

        LinkedList<String> tag3 = new LinkedList<String>();
        tag3.insert("insect");
        tag3.insert("butterfly");
        tag3.insert("flower");
        tag3.insert("color");

        LinkedList<String> tag4 = new LinkedList<String>();
        tag4.insert("insect");
        tag4.insert("butterfly");
        tag4.insert("flower");
        tag4.insert("black");

        LinkedList<String> tag5 = new LinkedList<String>();
        tag5.insert("animal");
        tag5.insert("fox");
        tag5.insert("tree");
        tag5.insert("grass");

        LinkedList<String> tag6 = new LinkedList<String>();
        tag6.insert("animal");
        tag6.insert("bear");
        tag6.insert("panda");
        tag6.insert("grass");

        LinkedList<String> tag7 = new LinkedList<String>();
        tag7.insert("animal");
        tag7.insert("wolf");
        tag7.insert("sky");
        tag7.insert("snow");

        LinkedList<String> tag8 = new LinkedList<String>();
        tag8.insert("animal");
        tag8.insert("raccoon");
        tag8.insert("log");
        tag8.insert("snow");

        Photo p1 = new Photo("hedgehog.jpg", tag1);
        Photo p2 = new Photo("bear.jpg", tag2);
        Photo p3 = new Photo("butterfly1.jpg", tag3);
        Photo p4 = new Photo("butterfly2.jpg", tag4);
        Photo p5 = new Photo("fox.jpg", tag5);
        Photo p6 = new Photo("panda.jpg", tag6);
        Photo p7 = new Photo("wolf.jpg", tag7);
        Photo p8 = new Photo("raccoon.jpg", tag8);

        PhotoManager pm = new PhotoManager();

        pm.addPhoto(p1);
        pm.addPhoto(p2);
        pm.addPhoto(p3);
        pm.addPhoto(p4);
        pm.addPhoto(p5);
        pm.addPhoto(p6);
        pm.addPhoto(p7);
        pm.addPhoto(p8);

        Album a = new Album("bears", "animalANDgrass", pm);

        LinkedList<Photo> PhotosOfA = a.getPhotos();

        if (!PhotosOfA.empty()) {

            PhotosOfA.findFirst();

            while (!PhotosOfA.last()) {

                System.out.println(PhotosOfA.retrieve().getPath());
                PhotosOfA.findNext();

            }

            System.out.println(PhotosOfA.retrieve().getPath());

        } else {

            System.out.println("No Photos");
        }
        System.out.println("----------------------------------------");

        pm.deletePhoto("panda.jpg");
        pm.deletePhoto("bear.jpg");

        PhotosOfA = a.getPhotos();

        if (!PhotosOfA.empty()) {

            PhotosOfA.findFirst();

            while (!PhotosOfA.last()) {

                System.out.println(PhotosOfA.retrieve().getPath());
                PhotosOfA.findNext();

            }

            System.out.println(PhotosOfA.retrieve().getPath());

        } else {

            System.out.println("No Photos");
        }
    }

}
/*

OUTPUT:
        hedgehog.jpg
        bear.jpg
        fox.jpg
        panda.jpg
        ----------------------------------------
        hedgehog.jpg
        fox.jpg

        ---------------------------------------------------------------------------------------------------------------------------------------
*/


class Test13 {

    public static void main(String[] args) {

        LinkedList<String> tag1 = new LinkedList<String>();
        tag1.insert("animal");
        tag1.insert("headgehog");
        tag1.insert("apple");
        tag1.insert("grass");

        LinkedList<String> tag2 = new LinkedList<String>();
        tag2.insert("animal");
        tag2.insert("bear");
        tag2.insert("cub");
        tag2.insert("grass");

        LinkedList<String> tag3 = new LinkedList<String>();
        tag3.insert("insect");
        tag3.insert("butterfly");
        tag3.insert("flower");
        tag3.insert("color");

        LinkedList<String> tag4 = new LinkedList<String>();
        tag4.insert("insect");
        tag4.insert("butterfly");
        tag4.insert("flower");
        tag4.insert("black");

        LinkedList<String> tag5 = new LinkedList<String>();
        tag5.insert("animal");
        tag5.insert("fox");
        tag5.insert("tree");
        tag5.insert("grass");

        LinkedList<String> tag6 = new LinkedList<String>();
        tag6.insert("animal");
        tag6.insert("bear");
        tag6.insert("panda");
        tag6.insert("grass");

        LinkedList<String> tag7 = new LinkedList<String>();
        tag7.insert("animal");
        tag7.insert("wolf");
        tag7.insert("sky");
        tag7.insert("snow");

        LinkedList<String> tag8 = new LinkedList<String>();
        tag8.insert("animal");
        tag8.insert("raccoon");
        tag8.insert("log");
        tag8.insert("snow");

        Photo p1 = new Photo("hedgehog.jpg", tag1);
        Photo p2 = new Photo("bear.jpg", tag2);
        Photo p3 = new Photo("butterfly1.jpg", tag3);
        Photo p4 = new Photo("butterfly2.jpg", tag4);
        Photo p5 = new Photo("fox.jpg", tag5);
        Photo p6 = new Photo("panda.jpg", tag6);
        Photo p7 = new Photo("wolf.jpg", tag7);
        Photo p8 = new Photo("raccoon.jpg", tag8);

        PhotoManager pm = new PhotoManager();

        pm.addPhoto(p1);
        pm.addPhoto(p2);
        pm.addPhoto(p3);
        pm.addPhoto(p4);
        pm.addPhoto(p5);
        pm.addPhoto(p6);
        pm.addPhoto(p7);
        pm.addPhoto(p8);

        Album a = new Album("bears", "", pm);

        LinkedList<Photo> PhotosOfA = a.getPhotos();

        if (!PhotosOfA.empty()) {

            PhotosOfA.findFirst();

            while (!PhotosOfA.last()) {

                System.out.println(PhotosOfA.retrieve().getPath());
                PhotosOfA.findNext();

            }

            System.out.println(PhotosOfA.retrieve().getPath());

        } else {

            System.out.println("No Photos");
        }
        System.out.println("----------------------------------------");

        pm.deletePhoto("lion.jpg");

        PhotosOfA = a.getPhotos();

        if (!PhotosOfA.empty()) {

            PhotosOfA.findFirst();

            while (!PhotosOfA.last()) {

                System.out.println(PhotosOfA.retrieve().getPath());
                PhotosOfA.findNext();

            }

            System.out.println(PhotosOfA.retrieve().getPath());

        } else {

            System.out.println("No Photos");
        }
    }

}
/*

OUTPUT:
        hedgehog.jpg
        bear.jpg
        butterfly1.jpg
        butterfly2.jpg
        fox.jpg
        panda.jpg
        wolf.jpg
        raccoon.jpg
        ----------------------------------------
        hedgehog.jpg
        bear.jpg
        butterfly1.jpg
        butterfly2.jpg
        fox.jpg
        panda.jpg
        wolf.jpg
        raccoon.jpg

        ---------------------------------------------------------------------------------------------------------------------------------------

*/

class Test14 {

    public static void main(String[] args) {

        LinkedList<String> tag1 = new LinkedList<String>();
        tag1.insert("animal");
        tag1.insert("headgehog");
        tag1.insert("apple");
        tag1.insert("grass");

        LinkedList<String> tag2 = new LinkedList<String>();
        tag2.insert("animal");
        tag2.insert("bear");
        tag2.insert("cub");
        tag2.insert("grass");

        LinkedList<String> tag3 = new LinkedList<String>();
        tag3.insert("insect");
        tag3.insert("butterfly");
        tag3.insert("flower");
        tag3.insert("color");

        LinkedList<String> tag4 = new LinkedList<String>();
        tag4.insert("insect");
        tag4.insert("butterfly");
        tag4.insert("flower");
        tag4.insert("black");

        LinkedList<String> tag5 = new LinkedList<String>();
        tag5.insert("animal");
        tag5.insert("fox");
        tag5.insert("tree");
        tag5.insert("grass");

        LinkedList<String> tag6 = new LinkedList<String>();
        tag6.insert("animal");
        tag6.insert("bear");
        tag6.insert("panda");
        tag6.insert("grass");

        LinkedList<String> tag7 = new LinkedList<String>();
        tag7.insert("animal");
        tag7.insert("wolf");
        tag7.insert("sky");
        tag7.insert("snow");

        LinkedList<String> tag8 = new LinkedList<String>();
        tag8.insert("animal");
        tag8.insert("raccoon");
        tag8.insert("log");
        tag8.insert("snow");

        Photo p1 = new Photo("hedgehog.jpg", tag1);
        Photo p2 = new Photo("bear.jpg", tag2);
        Photo p3 = new Photo("butterfly1.jpg", tag3);
        Photo p4 = new Photo("butterfly2.jpg", tag4);
        Photo p5 = new Photo("fox.jpg", tag5);
        Photo p6 = new Photo("panda.jpg", tag6);
        Photo p7 = new Photo("wolf.jpg", tag7);
        Photo p8 = new Photo("raccoon.jpg", tag8);

        PhotoManager pm = new PhotoManager();

        pm.addPhoto(p1);
        pm.addPhoto(p2);
        pm.addPhoto(p3);
        pm.addPhoto(p4);
        pm.addPhoto(p5);
        pm.addPhoto(p6);
        pm.addPhoto(p7);
        pm.addPhoto(p8);

        Album a = new Album("bears", "snakes", pm);

        LinkedList<Photo> PhotosOfA = a.getPhotos();

        if (!PhotosOfA.empty()) {

            PhotosOfA.findFirst();

            while (!PhotosOfA.last()) {

                System.out.println(PhotosOfA.retrieve().getPath());
                PhotosOfA.findNext();

            }

            System.out.println(PhotosOfA.retrieve().getPath());

        } else {

            System.out.println("No Photos");
        }
        System.out.println("----------------------------------------");

        pm.deletePhoto("lion.jpg");

        PhotosOfA = a.getPhotos();

        if (!PhotosOfA.empty()) {

            PhotosOfA.findFirst();

            while (!PhotosOfA.last()) {

                System.out.println(PhotosOfA.retrieve().getPath());
                PhotosOfA.findNext();

            }

            System.out.println(PhotosOfA.retrieve().getPath());

        } else {

            System.out.println("No Photos");
        }
    }

}

/*
OUTPUT:

        No Photos
        ----------------------------------------
        No Photos

        ----------------------------------------------------------------------------------------------------------------------

*/

class Test15 {

    public static void main(String[] args) {

        LinkedList<String> tag1 = new LinkedList<String>();
        tag1.insert("animal");
        tag1.insert("headgehog");
        tag1.insert("apple");
        tag1.insert("grass");

        LinkedList<String> tag2 = new LinkedList<String>();
        tag2.insert("animal");
        tag2.insert("bear");
        tag2.insert("cub");
        tag2.insert("grass");

        LinkedList<String> tag3 = new LinkedList<String>();
        tag3.insert("insect");
        tag3.insert("butterfly");
        tag3.insert("flower");
        tag3.insert("color");

        LinkedList<String> tag4 = new LinkedList<String>();
        tag4.insert("insect");
        tag4.insert("butterfly");
        tag4.insert("flower");
        tag4.insert("black");

        LinkedList<String> tag5 = new LinkedList<String>();
        tag5.insert("animal");
        tag5.insert("fox");
        tag5.insert("tree");
        tag5.insert("grass");

        LinkedList<String> tag6 = new LinkedList<String>();
        tag6.insert("animal");
        tag6.insert("bear");
        tag6.insert("panda");
        tag6.insert("grass");

        LinkedList<String> tag7 = new LinkedList<String>();
        tag7.insert("animal");
        tag7.insert("wolf");
        tag7.insert("sky");
        tag7.insert("snow");

        LinkedList<String> tag8 = new LinkedList<String>();
        tag8.insert("animal");
        tag8.insert("raccoon");
        tag8.insert("log");
        tag8.insert("snow");

        Photo p1 = new Photo("hedgehog.jpg", tag1);
        Photo p2 = new Photo("bear.jpg", tag2);
        Photo p3 = new Photo("butterfly1.jpg", tag3);
        Photo p4 = new Photo("butterfly2.jpg", tag4);
        Photo p5 = new Photo("fox.jpg", tag5);
        Photo p6 = new Photo("panda.jpg", tag6);
        Photo p7 = new Photo("wolf.jpg", tag7);
        Photo p8 = new Photo("raccoon.jpg", tag8);

        PhotoManager pm = new PhotoManager();

        pm.addPhoto(p1);
        pm.addPhoto(p2);
        pm.addPhoto(p3);
        pm.addPhoto(p4);
        pm.addPhoto(p5);
        pm.addPhoto(p6);
        pm.addPhoto(p7);
        pm.addPhoto(p8);

        Album a = new Album("bears", "bearANDgrassANDsnow", pm);

        LinkedList<Photo> PhotosOfA = a.getPhotos();

        if (!PhotosOfA.empty()) {

            PhotosOfA.findFirst();

            while (!PhotosOfA.last()) {

                System.out.println(PhotosOfA.retrieve().getPath());
                PhotosOfA.findNext();

            }

            System.out.println(PhotosOfA.retrieve().getPath());

        } else {

            System.out.println("No Photos");
        }
        System.out.println("----------------------------------------");

        pm.deletePhoto("lion.jpg");

        PhotosOfA = a.getPhotos();

        if (!PhotosOfA.empty()) {

            PhotosOfA.findFirst();

            while (!PhotosOfA.last()) {

                System.out.println(PhotosOfA.retrieve().getPath());
                PhotosOfA.findNext();

            }

            System.out.println(PhotosOfA.retrieve().getPath());

        } else {

            System.out.println("No Photos");
        }
    }

}
/*

OUTPUT:

        No Photos
        ----------------------------------------
        No Photos


*/
