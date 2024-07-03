//1 : one class can inherit can other class...
class Demo
{

}

class Hello extends Demo
{

}

// 2 :one class can implement can one interface
interface Demo
{

}
class Hello implement Demo
{

}

// 3 : one class can inherit one class and implement one interface at the time
interface Demo
{

}

class Hello
{

}

class PPA extends Hello implement Demo // 1 class ne inherit kel hello la and implement kel interface la

// 4 : one interface can inherit another interface
interface Demo
{

}

interface Hello extends Demo
{

}

// 5 : one class can implements more than one interfaces
interface Demo
{

}

interface Hello
{

}

class PPA implements Demo,Hello //like a multiple
