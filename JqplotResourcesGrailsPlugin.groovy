class JqplotResourcesGrailsPlugin {
    def version = "1.0.0b2.0"

    def grailsVersion = "1.3.7 > *"

    def dependsOn = [
            'jquery':'1.6 > *',
            'resources':'1.0 > *'
    ]

    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    def title = "Jqplot Resources Plugin" // Headline display name of the plugin
    def author = "Stefano Gualdi"
    def authorEmail = "stefano.gualdi@gmail.com"
    def description = '''\
Brief summary/description of the plugin.
'''

    def documentation = "http://grails.org/plugin/jqplot-resources"

    def license = "APACHE"

    // Details of company behind the plugin (if there is one)
//    def organization = [ name: "My Company", url: "http://www.my-company.com/" ]

    // Location of the plugin's issue tracker.
//    def issueManagement = [ system: "JIRA", url: "http://jira.grails.org/browse/GPJQPLOTRESOURCES" ]

    // Online location of the plugin's browseable source code.
//    def scm = [ url: "http://svn.grails-plugins.codehaus.org/browse/grails-plugins/" ]
}
