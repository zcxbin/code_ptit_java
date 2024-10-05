package Cinema;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        Category[] categories = new Category[n];
        for (int i = 0; i < n; i++) {
            categories[i] = new Category("TL" + String.format("%03d", i + 1), sc.nextLine());
        }
        Movie[] movies = new Movie[m];
        for (int i = 0; i < m; i++) {
            String category_id = sc.nextLine();
            String date = sc.nextLine();
            String name = sc.nextLine();
            String episodes = sc.nextLine();

            Category category = findCategoryById(categories, category_id);
            movies[i] = new Movie(i + 1, date, name, episodes, category);
        }
        Arrays.sort(movies);
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
    }

    private static Category findCategoryById(Category[] categories, String id) {
        for (Category category : categories) {
            if (category.getId().equals(id)) {
                return category;
            }
        }
        return null;
    }
}
/*
2 3
Hai huoc
Tinh cam
TL001
25/11/2021
Phim so 1
10
TL001
04/12/2021
Phim so 2
15
TL002
25/11/2021
Phim so 3
5
 */