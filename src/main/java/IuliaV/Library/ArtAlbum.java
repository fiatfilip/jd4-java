package IuliaV.Library;

public class ArtAlbum extends Book{
    public enum Quality { POOR, GOOD, PRISTINE}
    final Quality paperQuality;
    public ArtAlbum(String albumName, int numberOfPages, Quality paperQuality) {
        super(albumName, numberOfPages);
        this.paperQuality = paperQuality;
    }
}
