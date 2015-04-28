package rawItemCatalog

//import grails.rest.Resource

//@Resource(uri='/items', formats = ['json', 'xml'])
class Item {

    static hasMany = [categories: Category]

    String name
    String comments
    boolean sellable
    MeasureUnit measureUnit

    static constraints = {
        name(blank: false, unique: true)
        comments(blank: false)
        sellable()
        measureUnit()
        categories()
    }
}
