package oops;

public class CloningDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Feature feature = new Feature(1, "Java trailer");
        Season season1 = new Season(1, "Winter Java", feature);
        Season season2 = (Season) season1.clone();
        System.out.println(season1);
        System.out.println(season2);
        System.out.println("Lets make changes");
        feature.setFeatureId(200);
        System.out.println(season1);
        System.out.println(season2);

    }
}

class Season implements Cloneable {
    private int seasonId;
    private String seasonTitle;
    private Feature feature;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Season seasonClone = (Season) super.clone();
        Feature featureClone = (Feature) seasonClone.getFeature().clone();
        seasonClone.setFeature(featureClone);
        return seasonClone;
    }

    public Season(int seasonId, String seasonTitle, Feature feature) {
        this.seasonId = seasonId;
        this.seasonTitle = seasonTitle;
        this.feature = feature;
    }

    public int getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(int seasonId) {
        this.seasonId = seasonId;
    }

    public String getSeasonTitle() {
        return seasonTitle;
    }

    public void setSeasonTitle(String seasonTitle) {
        this.seasonTitle = seasonTitle;
    }

    public Feature getFeature() {
        return feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonId=" + seasonId +
                ", seasonTitle='" + seasonTitle + '\'' +
                ", feature=" + feature +
                '}';
    }
}

class Feature implements Cloneable {
    private int featureId;
    private String featureTitle;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Feature{" +
                "featureId=" + featureId +
                ", featureTitle='" + featureTitle + '\'' +
                '}';
    }

    public int getFeatureId() {
        return featureId;
    }

    public void setFeatureId(int featureId) {
        this.featureId = featureId;
    }

    public String getFeatureTitle() {
        return featureTitle;
    }

    public void setFeatureTitle(String featureTitle) {
        this.featureTitle = featureTitle;
    }

    public Feature(int featureId, String featureTitle) {
        this.featureId = featureId;
        this.featureTitle = featureTitle;
    }
}