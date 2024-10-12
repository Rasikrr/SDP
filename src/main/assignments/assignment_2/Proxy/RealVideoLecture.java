package assignment_2.Proxy;

public class RealVideoLecture implements VideoLecture {
    private String fileName;

    public RealVideoLecture(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading video: " + fileName);
    }

    @Override
    public void getInfo() {
        System.out.println("Video info: " + fileName);
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + fileName);
    }
}
