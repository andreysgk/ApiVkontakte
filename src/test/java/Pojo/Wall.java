package Pojo;

public class Wall {
    private Object donut;
    private Integer is_pinned;
    private Object comments;
    private Double short_text_rate;
    private String hash;
    private String type;
    private Integer carousel_offset;
    private Object attachments;
    private Integer date;
    private Integer from_id;
    private Integer id;
    private Boolean is_favorite;
    private Object likes;
    private Integer owner_id;
    private Object post_source;
    private String post_type;
    private Object reposts;
    private String text;
    private Boolean zoom_text;
    private Object views;

    public Wall(Object donut, Integer is_pinned, Object comments, Double short_text_rate, String hash, String type, Integer carousel_offset, Object attachments, Integer date, Integer from_id, Integer id, Boolean is_favorite, Object likes, Integer owner_id, Object post_source, String post_type, Object reposts, String text, Boolean zoom_text, Object views) {
        this.donut = donut;
        this.is_pinned = is_pinned;
        this.comments = comments;
        this.short_text_rate = short_text_rate;
        this.hash = hash;
        this.type = type;
        this.carousel_offset = carousel_offset;
        this.attachments = attachments;
        this.date = date;
        this.from_id = from_id;
        this.id = id;
        this.is_favorite = is_favorite;
        this.likes = likes;
        this.owner_id = owner_id;
        this.post_source = post_source;
        this.post_type = post_type;
        this.reposts = reposts;
        this.text = text;
        this.zoom_text = zoom_text;
        this.views = views;
    }

    public Wall() {
    }

    public Object getDonut() {
        return donut;
    }

    public Integer getIs_pinned() {
        return is_pinned;
    }

    public Object getComments() {
        return comments;
    }

    public Double getShort_text_rate() {
        return short_text_rate;
    }

    public String getHash() {
        return hash;
    }

    public String getType() {
        return type;
    }

    public Integer getCarousel_offset() {
        return carousel_offset;
    }

    public Object getAttachments() {
        return attachments;
    }

    public Integer getDate() {
        return date;
    }

    public Integer getFrom_id() {
        return from_id;
    }

    public Integer getId() {
        return id;
    }

    public Boolean getIs_favorite() {
        return is_favorite;
    }

    public Object getLikes() {
        return likes;
    }

    public Integer getOwner_id() {
        return owner_id;
    }

    public Object getPost_source() {
        return post_source;
    }

    public String getPost_type() {
        return post_type;
    }

    public Object getReposts() {
        return reposts;
    }

    public String getText() {
        return text;
    }

    public Boolean getZoom_text() {
        return zoom_text;
    }

    public Object getViews() {
        return views;
    }
}
