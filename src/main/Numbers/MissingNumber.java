class Main {
    public static void main(String[] args) {
        
        int[] numbers = new int[]{1, 2, 3, 4, 6, 7};
            int maxy = numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(maxy< numbers[i]){
                maxy = numbers[i];
            }
        }
        
        
        int total = maxy*(maxy+1)/2;
            int sum =0;
        for(int num : numbers){
            sum +=num;
        }
        System.out.println(total - sum);
        
        
        
       
    }
}
