package android.example.huys;

public class Location {
    private final String locationName;
    private final String locationDescription;
    private final String locationPrice;
    private final String locationAddress;
    private final int locationImage;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;


    public Location(String locationName, String locationDescription, int locationImage, String locationPrice, String locationAddress) {
        this.locationName = locationName;
        this.locationDescription = locationDescription;
        this.locationImage = locationImage;
        this.locationPrice = locationPrice;
        this.locationAddress = locationAddress;
    }

    public String getLocationName() {
        return locationName;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public int getLocationImage() {
        return locationImage;
    }

    public String getLocationPrice() {
        return locationPrice;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public boolean hasImage() {
        return getLocationImage() != NO_IMAGE_PROVIDED;
    }
}
