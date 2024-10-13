package smartphone;

// isTurnedOn, batteryLevel, currentTime, percentageOfOccupiedMemory, numberOfPhotosInGallery
// turn on, turn off, open gallery, close gallery, take photo

public class Smartphone {
    boolean isTurnedOn = false;
    byte batteryLevel;
    int currentTime;
    byte percentageOfOccupiedMemory;
    short numberOfPhotosInGallery;
    boolean isGalleryOpened = false;
    
    public void turnOn() {
        isTurnedOn = true;
    }

    public void turnOff() {
        if (isTurnedOn == true) {
            isTurnedOn = false;
        }
    }

    public void openGallery() {
        if (isGalleryOpened == false) {
            isGalleryOpened = true;
        }
    }

    public void closeGallery() {
        if (isGalleryOpened == true) {
            isGalleryOpened = false;
        }
    }

    public void takePhoto() {
        numberOfPhotosInGallery += 1;
    }

}