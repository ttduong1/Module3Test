import java.util.Scanner;

public class Exam_B1 {
    public static void main(String[] args) {
        int[] arr = new int[100]; // Khai báo mảng 1 chiều gồm 100 phần tử số nguyên.
        Scanner sc = new Scanner(System.in);
            int choice, size = 0;
//            int[] arr;

            do {
                System.out.println("\nMenu:");
                System.out.println("1.Nhập số phần tử và giá trị cho các phần tử của mảng từ bàn phím.");
                System.out.println("2.In ra giá trị các phần tử trong mảng.");
                System.out.println("3.Tính tổng và in ra các phần tử có giá trị lẻ trong mảng.");
                System.out.println("4.In ra giá trị lớn nhất và nhỏ nhất trong mảng.");
                System.out.println("5.Thống kê số lượng phần tử chia hết cho 2 và 3 trong mảng.");
                System.out.println("6.In ra mảng đảo ngược.");
                System.out.println("7.In ra các phần tử và tổng số các phần tử là số nguyên tố trong mảng.");
                System.out.println("8.Sắp xếp mảng tăng dần.");
                System.out.println("9.Thoát.");
                System.out.println("Lựa chọn của bạn: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Nhập số phần tử của mảng: ");
                        size = sc.nextInt();
                        arr = new int[size];
                        System.out.println("Nhập các phần tử của mảng:");
                        for (int i = 0; i < size; i++) {
                            System.out.print("Phần tử thứ " + (i + 1) + ": ");
                            arr[i] = sc.nextInt();
                        }
                        break;

                    case 2:
                        System.out.println("Các phần tử trong mảng là:");
                        for (int i = 0; i < size; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                        break;

                    case 3:
                        int sumOdd = 0;
                        System.out.print("Các phần tử lẻ trong mảng là:");
                        for (int i = 0; i < size; i++) {
                            if (arr[i] % 2 != 0) {
                                System.out.print(arr[i] + " ");
                                sumOdd += arr[i];
                            }
                        }
                        System.out.println("\nTổng các phần tử lẻ trong mảng là: " + sumOdd);
                        break;

                    case 4:
                        int max = arr[0];
                        int min = arr[0];
                        for (int i = 1; i < size; i++) {
                            if (arr[i] > max) {
                                max = arr[i];
                            }
                            if (arr[i] < min) {
                                min = arr[i];
                            }
                        }
                        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
                        System.out.println("Giá trị bé nhất trong mảng là: " + min);
                        break;

                    case 5:
                        System.out.print("Nhập số phần tử của mảng: ");
                        int n = sc.nextInt();


                        for (int i = 0; i < n; i++) {
                            System.out.printf("Nhập phần tử thứ %d: ", i+1);
                            arr[i] = sc.nextInt();
                        }


                        int count2 = 0;
                        int count3 = 0;

                        for (int i = 0; i < n; i++) {
                            if (arr[i] % 2 == 0) { // nếu phần tử chia hết cho 2
                                count2++;
                            }
                            if (arr[i] % 3 == 0) { // nếu phần tử chia hết cho 3
                                count3++;
                            }
                        }

                        // In kết quả
                        System.out.printf("Số phần tử chia hết cho 2: %d%n", count2);
                        System.out.printf("Số phần tử chia hết cho 3: %d%n", count3);
                        break;

                    case 6:
                        int[] reversedArr = new int[size];
                        int j = size - 1;
                        System.out.println("Mảng đảo ngược là:");
                        for (int i = 0; i < size; i++) {
                            reversedArr[j] = arr[i];
                            j--;
                        }
                        for (int i = 0; i < size; i++) {
                            System.out.print(reversedArr[i] + " ");
                        }
                        System.out.println();
                        break;
                }
            }while (choice != 9);
                }
            }

