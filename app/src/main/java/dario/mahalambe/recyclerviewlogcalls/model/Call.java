package dario.mahalambe.recyclerviewlogcalls.model;

/**
 * Created by Dario Mahalambe on 04/01/2018.
 */

public class Call {


    private String name;

    private String timeOfCall;

    private String mobileCommunication;

    private String callType;

    private int letterImage;


    public Call(String name, String timeOfCall, String mobileCommunication, String callType, int letterImage) {
        this.name = name;
        this.timeOfCall = timeOfCall;
        this.mobileCommunication = mobileCommunication;
        this.callType = callType;
        this.letterImage = letterImage;
    }



    public String getName() {
        return name;
    }

    public String getTimeOfCall() {
        return timeOfCall;
    }

    public String getMobileCommunication() {
        return mobileCommunication;
    }

    public String getCallType() {
        return callType;
    }

    public int getLetterImage() {
        return letterImage;
    }
}
