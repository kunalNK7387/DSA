static double getAverage1(int [] arr) {

    double sum = 0;//constant TC we taken space for variables
    for (int i : arr) {
        sum += i;
    }//due to travsing array TC is O(n)
    int size = arr.length;//constant TC taken space for variables
    double avg = sum / size;//constant TC taken space for variables
    return avg;
}
    static void main() {
        int[] arr={2,4,1,3};
        System.out.println(getAverage1(arr));

}

// We Solve this Problem in O(1) TC.