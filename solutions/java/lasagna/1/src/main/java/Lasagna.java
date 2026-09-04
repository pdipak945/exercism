public class Lasagna {
    private int expectedTime = 40;
    
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return expectedTime;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int timeTaken){
        return expectedTime - timeTaken;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int totalLayers){
        return totalLayers * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int totalLayers, int timeTaken){
        return timeTaken + (totalLayers * 2);
    }
}
