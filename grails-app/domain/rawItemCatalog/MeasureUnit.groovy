package rawItemCatalog

import grails.rest.Resource

@Resource(uri='/MeasureUnit', formats = ['json', 'xml'])
class MeasureUnit {

    String name
    String abreviation
    String comments

    static constraints = {
    }
}
