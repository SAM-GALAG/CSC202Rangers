package rangersA;

public class Time
{
    //Arrive time.
	private int aTime;
	
	//Service time.
    private int sTime;
    
    //Wait time
    private int wTime;
    
    //Finish time
    private int fTime;
   
    //Empty constructor
    public Time(){
       
    }
    
    //Full constructor.
    public Time(int arrival, int service, int wait){
        aTime = arrival;
       
        sTime = service;
       
        wTime = wait;
        
        //Finish time will be the combined sum of arrival, service and wait time.
        fTime = arrival + service + wait;
    }
    
    //toString
    public String toString(){
        return "|Arrival Time: " + aTime + ":00|\t" + "|Service Time: " + sTime + ":00|\t" + "|Finish Time: " + fTime + ":00|\t" +
        "|Wait Time: " + wTime + ":00|\t";
    }
   
    //toString that helps with formatting.
    public String toStringL(){
        return "------------------------------------------------------------------------------------------";
    }
   
    
    //Getters & Setters
    public int getAtime(){
        return aTime;
    }
   
    public void setAtime(int time){
        aTime = time;
    }
   
   
    public int getStime(){
        return sTime;
    }
   
    public void setStime(int time){
        sTime = time;
    }
   
   
    public int getWtime(){
        return wTime;
    }
   
    public void setWtime(int time){
        wTime = time;
    }
   
    public int getFtime(){
        return fTime;
    }
   
    public void setFtime(int time){
        fTime = time;
    }
   
}