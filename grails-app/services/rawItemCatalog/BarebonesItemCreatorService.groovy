package rawItemCatalog

import grails.transaction.Transactional

@Transactional
class BarebonesItemCreatorService {

    def createNewItem() {
        Set<Category> categories = new HashSet<Category>()
        categories.add(Category.get(1))
        categories.add(Category.get(6))
        Item item = new Item(name: "Barebones",
            comments: "Barebones item",
            sellable: false,
            measureUnit: MeasureUnit.get(5),
            categories: categories)
        item.save()
    }
}
