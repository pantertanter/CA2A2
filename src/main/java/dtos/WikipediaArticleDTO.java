package dtos;

public class WikipediaArticleDTO {
    private String title;
    private String description;
    private int pageid;
    private String extract;
    private String url;
    private String thumbnail_source;

    public WikipediaArticleDTO(String title, String description, int pageid, String extract, String url, String thumbnail_source) {
        this.title = title;
        this.description = description;
        this.pageid = pageid;
        this.extract = extract;
        this.url = url;
        this.thumbnail_source = thumbnail_source;
    }
}
