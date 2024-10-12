package assignment_2.Proxy;

public class ProxyVideoLecture implements VideoLecture {
    private RealVideoLecture realVideoLecture;
    private String fileName;

    public ProxyVideoLecture(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void getInfo() {
        System.out.println("Video info: " + fileName);
    }

    @Override
    public void play() {
        if (realVideoLecture == null) {
            realVideoLecture = new RealVideoLecture(fileName);
        }
        realVideoLecture.play();
    }
}
