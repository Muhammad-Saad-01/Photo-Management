public class Album {
    String name, condition;
    PhotoManager manager;

    // Constructor
    public Album(String name, String condition, PhotoManager manager) {
        this.name = name;
        this.condition = condition;
        this.manager = manager;
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
        return null;
    }

    // Return the number of tag comparisons used to find all photos of the album
    public int getNbComps() {
        return 0;
    }
}
