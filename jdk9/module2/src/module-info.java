module module2 {

    /*
     * 关键字说明：
     *      exports：暴露模块，使得其他模块可以引用该模块。可配合to关键字直接将包导入到另一个module中，例：exports package to module1,module2...
     *      opens：如果该关键字加载package上，那么使用exports导出的package其可见度是最高的，并且其他模块可以通过反射来创建对象或访问属性。可配合to关键字直接指定哪些模块对该package的可见度最高，例：opens package to module1,module2...
     *              注意：如果opens的package太多的话，可以使用open关键字声明module，这样整个module的可见度都是最高的
     *      requires：声明依赖的模块，引用其他暴露的模块。
     *          可配合static关键字一起使用，这样表示其编译时是强依赖关系，但运行时是可选的。
     *          可配合transitive关键字一起使用，这样表示依赖当前模块的其他模块具有隐式依赖性。
     *              例如：当前模块是B，模块B依赖模块A，模块C依赖模块B
     *                    如果B模块使用transitive关键字引入模块A，那么模块C也将引入模块A
     *                    C -> B -> A
     *                    C ------> A
     *
     *      Java允许使用服务提供者和服务使用者相分离的机制。
     *      provides：服务提供者，使用该关键字提供服务接口。与with关键字一起使用，可以提供接口实现类，即：provides Interface with InterfaceImpl1,InterfaceImpl2...
     *              注意：在provides中的接口，其接口实现类不允许出现在其它module下
     *      uses：服务使用者，使用该关键字决定使用哪个接口。用java.util.ServiceLoader类，来获取provides的接口实现类。
     */

    /**
     * 引入其它的Module
     */
    requires  module1;

}