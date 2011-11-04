def configDefaultBundle = 'jqplot_bundle'
// def jqueryPlugin = applicationContext.pluginManager.getGrailsPlugin('jquery')

modules = {
    'jqplot-date' {
        defaultBundle configDefaultBundle

        dependsOn 'jqplot'

        resource url: [plugin: 'jqplot-resources', dir: 'js/plugins', file: 'jqplot.dateAxisRenderer.js']
    }

    'jqplot-ajax' {
        defaultBundle configDefaultBundle

        dependsOn 'jqplot'

        resource url: [plugin: 'jqplot-resources', dir: 'js/plugins', file: 'jqplot.json2.js']
    }

    'jqplot-category' {
        defaultBundle configDefaultBundle

        dependsOn 'jqplot'

        resource url: [plugin: 'jqplot-resources', dir: 'js/plugins', file: 'jqplot.categoryAxisRenderer.js']
    }

    jqplot {
        defaultBundle configDefaultBundle
/*
        if (jqueryPlugin) {
            dependsOn 'jquery'
        }
*/
        dependsOn 'jquery'

        resource url: [plugin: 'jqplot-resources', dir: 'css', file: 'jquery.jqplot.css']
        resource url: [plugin: 'jqplot-resources', dir: 'js', file: 'excanvas.js', wrapper: { s -> "<!--[if lt IE 9]>$s<![endif]-->" }]
        resource url: [plugin: 'jqplot-resources', dir: 'js', file: 'jquery.jqplot.js']
    }

}