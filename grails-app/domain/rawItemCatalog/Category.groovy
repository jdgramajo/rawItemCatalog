package rawItemCatalog

import grails.rest.Resource

@Resource(uri = '/categories', formats = ['json', 'xml'])
class Category {

    static belongsTo = [parentCategory: Category]

    String name
    String comments

    static constraints = {
    }
}
