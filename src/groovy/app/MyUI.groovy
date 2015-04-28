package app

import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.Label
import rawItemCatalog.Category

class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {

		VerticalLayout layout = new VerticalLayout()
        layout.setMargin(true)

        Category.findAll().each {
            layout.addComponent(new Label(it.name))
        }

		setContent(layout)
    }
}
