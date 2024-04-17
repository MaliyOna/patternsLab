package Abstractions;

public interface IHandler {
    IHandler SetNext(IHandler handler);
    void Handle(Character character, String request);
}
