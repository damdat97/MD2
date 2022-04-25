package io_textfile.timgiatrilonnhatvaghifile;

import java.util.List;

public class FindMaxExample {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\MD2\\TH\\src\\io_textfile\\timgiatrilonnhatvaghifile\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("D:\\MD2\\TH\\src\\io_textfile\\timgiatrilonnhatvaghifile\\result.txt", maxValue);
    }
}
