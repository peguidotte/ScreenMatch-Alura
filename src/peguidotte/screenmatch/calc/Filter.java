package peguidotte.screenmatch.calc;

import peguidotte.screenmatch.models.Title;


public class Filter {
    private String recommendation;

    public void filter(Rate rate, Title title){
        if (rate.getRating() >= 4.5){
            System.out.println(title.getName() + " Is one of the favorites!");
        } else if (rate.getRating() >= 3.5){
            System.out.println("Everyone is loving " + title.getName() + ".");
        } else if (rate.getRating() >= 2.5){
            System.out.println("Everyone is liking " + title.getName() + ".");
        } else {
            System.out.println("You should to try " + title.getName() + ".");
        }
    }
}
