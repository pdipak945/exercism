public class Lasagna {
    private int expectedTime = 40;
    

    public int expectedMinutesInOven(){
        return expectedTime;
    }

    public int remainingMinutesInOven(int timeTaken){
        return expectedMinutesInOven() - timeTaken;
    }

    public int preparationTimeInMinutes(int totalLayers){
        return totalLayers * 2;
    }

    public int totalTimeInMinutes(int totalLayers, int timeTaken){
        return timeTaken + preparationTimeInMinutes(totalLayers);
    }
}
