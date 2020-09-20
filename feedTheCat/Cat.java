/*      1. Расширить задачу про котов и тарелки с едой
        2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20)
        3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true
        4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
        5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль
        6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку   */
package Homework7;

public class Cat {
    protected String name;
    protected int appetite;
    protected int fullness;

    String getName() {
        return name;
    }
    int getAppetite() {
        return appetite;
    }
    int getFullness() {
        return fullness;
    }
    void setFullness(int satiety) {
        this.fullness = fullness;
    }
    public Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = 0;
    }
    public void eat(Plate p){
        p.decreaseFood(appetite);
        fullness += fullness;
    }

}
    

