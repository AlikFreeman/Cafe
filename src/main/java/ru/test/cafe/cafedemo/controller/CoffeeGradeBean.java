package ru.test.cafe.cafedemo.controller;

import org.springframework.stereotype.Component;
import ru.test.cafe.cafedemo.model.CoffeeGrade;
import ru.test.cafe.cafedemo.service.coffeGrade.CoffeeGradeServiceImpl;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component

public class CoffeeGradeBean {
    private CoffeeGrade coffeeGrade = new CoffeeGrade();

    private Boolean editMode = false;

    private List<CoffeeGrade> selectedGrades = new ArrayList<>();

    private final CoffeeGradeServiceImpl coffeeGradeService;

    private List<CoffeeGrade> menuList = new ArrayList<>();

    private Boolean validationAddForm = false;


    public CoffeeGradeBean(CoffeeGradeServiceImpl coffeeGradeService) {
        this.coffeeGradeService = coffeeGradeService;
    }

    @PostConstruct
    private void setMenu() {
        List<CoffeeGrade> menuList = new ArrayList<>();
    }


    public void deleteAllHighlighted() {
        coffeeGradeService.deleteCoffeeGrade(selectedGrades);
        menuList.clear();
    }

    public void addCoffeeGrade() {
        if (coffeeGrade.getPrice() != null
                && coffeeGrade.getGradeNameRu() != null
                && coffeeGrade.getGradeNameEng() != null) {
            coffeeGradeService.addCoffeeGrade(coffeeGrade);
            menuList.clear();
            coffeeGrade = new CoffeeGrade();
        } else {
            validationAddForm = true;
        }
    }

    public void updateEditMode() {
        editMode = !editMode;
    }
    public void onload()
    {
        editMode = false;
        if(menuList.isEmpty()) {
            editMode = true;
        }
    }


    public CoffeeGrade getCoffeeGrade()
    {
        return coffeeGrade;
    }

    public void setCoffeeGrade(CoffeeGrade coffeeGrade)
    {
        this.coffeeGrade = coffeeGrade;
    }

    public Boolean getEditMode()
    {
        return editMode;
    }

    public void setEditMode(Boolean editMode)
    {
        this.editMode = editMode;
    }

    public List<CoffeeGrade> getSelectedGrades()
    {
        return selectedGrades;
    }

    public void setSelectedGrades(List<CoffeeGrade> selectedGrades)
    {
        this.selectedGrades = selectedGrades;
    }

    public List<CoffeeGrade> getMenuList()
    {
        if(menuList.isEmpty())
        {
            menuList = coffeeGradeService.getAllCoffeeGrades();
        }
        return menuList;
    }

    public void setMenuList(List<CoffeeGrade> menuList)
    {
        this.menuList = menuList;
    }

    public Boolean getValidationAddForm()
    {
        return validationAddForm;
    }

    public void setValidationAddForm(final Boolean validationAddForm)
    {
        this.validationAddForm = validationAddForm;
    }

}
