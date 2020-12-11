package osirisc.coastappli.Database;

/**
 * This class defines the MethodErosionDistance objects, that store the necessary information for every measurement protocol
 */
public class MethodErosionDistance extends Measure {

    private Double markerLatitude;
    private Double markerLongitude;
    private byte[] photo;

    /**
     * We have the 2 following constructors :
     */

    public MethodErosionDistance(){}

    public MethodErosionDistance(Double markerLatitude, Double markerLongitude, byte[] photo) {
        this.markerLatitude = markerLatitude;
        this.markerLongitude = markerLongitude;
        this.photo = photo;

    }

    /**
     * The following functions are all the getters and setters for every single attribute of a MethodErosionDistance object
     * @return
     */

    public Double getMarkerLatitude() {
        return markerLatitude;
    }

    public void setMarkerLatitude(Double markerLatitude) {
        this.markerLatitude = markerLatitude;
    }

    public Double getMarkerLongitude() {
        return markerLongitude;
    }

    public void setMarkerLongitude(Double markerLongitude) { this.markerLongitude = markerLongitude; }

    public byte[] getPhoto() {
        return this.photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

}
