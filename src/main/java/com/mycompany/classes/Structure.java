/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classes;

/**
 *
 * @author vasqu
 * @param <T>
 */
public class Structure<T extends Comparable<T> > implements IStructure {
    private Node<T> first;
    private Node<T> last;
    private Node<T> current;
    private Node<T> location;

    //getters and setters
    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }

    public Node<T> getCurrent() {
        return current;
    }

    public void setCurrent(Node<T> current) {
        this.current = current;
    }

    public Node<T> getLocation() {
        return location;
    }

    public void setLocation(Node<T> location) {
        this.location = location;
    }
    //function

    @Override
    public void add(Comparable element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
