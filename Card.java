




public class Card {
    public String name;
    public Category[] categories;

    public Card(String name, int speed, int weight, int era, int legs, int wings) {
        this.name = name;
        categories = new Category[5];
        categories[0] = new Category("Speed", speed);
        categories[1] = new Category("Weight", weight);
        categories[2] = new Category("Era", era);
        categories[3] = new Category("Legs", legs);
        categories[4] = new Category("Wings", wings);
    }

    public String getName() {
        return name;
    }

    public Category getCategory(String catName) {
        for (int i = 0; i < categories.length; i++) {
            if(catName.equals(categories[i].getName()))
            {
                return categories[i];
            }

        }
        return null;
    }

    public boolean isBetterThan(Card newCard, String catName){
        if(this.getCategory(catName).getValue() > newCard.getCategory(catName).getValue()){
            return true;
        }
        else{
            return false;
        }
    }
}
