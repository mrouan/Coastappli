package osirisc.coastappli.Database;

/**
 * This class defines the MethodErosionDistance objects, that store the necessary information for every measurement protocol
 */
public class MethodErosionDistance {

    private Double markerLatitude;
    private Double markerLongitude;
    private float distance;
    private float distancePerson;

    /**
     * We have the 2 following constructors :
     */

    public MethodErosionDistance(){}

    public MethodErosionDistance(Double markerLatitude, Double markerLongitude, float distance, float distancePerson) {
        this.markerLatitude = markerLatitude;
        this.markerLongitude = markerLongitude;
        this.distance = distance;
        this.distancePerson = distancePerson;

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

    public float getDistance() {
        return distance;
    }

    public void setPhoto(float distance) {
        this.distance = distance;
    }

    public float getDistancePerson() { return distancePerson; }

    public void setDistancePerson(float distancePerson) { this.distancePerson = distancePerson; }
}
