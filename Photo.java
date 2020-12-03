public class Photo {
    LinkedList<String> tags;
    String path;
    // Constructor

    public Photo(String path, LinkedList<String> tags) {
        this.tags = tags;
        this.path = path;
    }

    // Return the path (full file name) of the photo. A photo is uniquely identified by its path.
    public String getPath() {
        return path;
    }

    // Return all tags associated with the photo
    public LinkedList<String> getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return "Photo {path=" + path + "}";
    }

    /* @Override
    public String toString() {
        return "Photo {path=" + path + " ," + tags + "}";
    }*/

}
