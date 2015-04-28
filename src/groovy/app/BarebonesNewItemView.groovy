package app

import rawItemCatalog.*

import com.vaadin.grails.Grails
import com.vaadin.navigator.View
import com.vaadin.navigator.ViewChangeListener
import com.vaadin.ui.Button
import com.vaadin.ui.VerticalLayout

class BarebonesNewItemView extends VerticalLayout implements View {

    static final String VIEW_NAME = "barebonesNewItem"

    @Override
    void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

        Button button = new Button("Create New Item")
        button.addClickListener(new Button.ClickListener() {
            @Override
            void buttonClick(Button.ClickEvent clickEvent) {
                BarebonesItemCreatorService barebonesItemCreatorService = Grails.get(BarebonesItemCreatorService)

                try {
                    barebonesItemCreatorService.createNewItem()
                } catch (Exception e) {
                    println "failed: ${e.message}"
                }

                println Category.findAll()
                println MeasureUnit.findAll()

            }

        })

        addComponent(button)

    }

}