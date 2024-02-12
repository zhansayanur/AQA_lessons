package lesson_5.enums.ex1;

public class StartUpForOs {
    public static void main(String[] args) {
        startPlatform(Platforms.WRONG_PLATFORM);
        startPlatformSwitchCase(Platforms.WRONG_PLATFORM);
    }

    public static void startPlatform(Platforms platforms){
        if(platforms.equals(Platforms.ANDROID)){
            System.out.println("We start on Android OS.");
        }else if(platforms.equals(Platforms.IOS)){
            System.out.println("We start on IOS OS.");
        }else if(platforms.equals(Platforms.WINDOWS)){
            System.out.println("We start on Windows OS.");
        }else {
            System.out.println("This is " + Platforms.WRONG_PLATFORM);
        }
    }

    public static void startPlatformSwitchCase(Platforms platforms){
        switch (platforms){
            case IOS -> System.out.println("We start on IOS OS.");
            case ANDROID -> System.out.println("We start on Android OS.");
            case WINDOWS -> System.out.println("We start on Windows OS.");
            default -> System.out.println("Incorrect OS " + Platforms.WRONG_PLATFORM);
        }
    }
}
