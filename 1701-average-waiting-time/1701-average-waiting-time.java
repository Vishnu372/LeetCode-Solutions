class Solution {
    public double averageWaitingTime(int[][] customers) {
        double sum=0;
        int n=customers.length;
        int totaltime=0;
        int wait=0;
        for(int i=0;i<n;i++)
        {
            int arrive=customers[i][0];
            int prepare=customers[i][1];
            if(totaltime<arrive)
            {
                totaltime=arrive+prepare;
                wait=Math.abs(totaltime-arrive);
            }
            else{
                totaltime+=prepare;
                wait=Math.abs(totaltime-arrive);
            }
            sum+=wait;
        }
        double avg=sum/n;
        return avg;
    }
}