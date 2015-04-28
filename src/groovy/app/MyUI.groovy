package app

import com.vaadin.navigator.Navigator
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.UI

class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {

        Navigator navigator = new Navigator(this, this)

        navigator.addView(BarebonesNewItemView.VIEW_NAME, BarebonesNewItemView)

        navigator.navigateTo(BarebonesNewItemView.VIEW_NAME)

    }
}
