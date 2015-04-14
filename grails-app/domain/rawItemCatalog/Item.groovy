package rawItemCatalog

class Item {

    static hasMany = [categories: rawItemCatalog.Category]

    String name
    String comments
    boolean sellable
    MeasureUnit measureUnit

    static constraints = {
    }
}
