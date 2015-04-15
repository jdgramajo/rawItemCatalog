package rawItemCatalog

import grails.rest.Resource

@Resource(uri='/items', formats = ['json', 'xml'])
class Item {

    static hasMany = [categories: rawItemCatalog.Category]

    String name
    String comments
    boolean sellable
    MeasureUnit measureUnit

    static constraints = {
    }
}
