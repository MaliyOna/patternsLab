package Abstractions;

public abstract class AbstractHandler implements IHandler {
    private IHandler _nextHandler;

    public IHandler SetNext(IHandler handler) {
        _nextHandler = handler;
        return handler;
    }

    @Override
    public void Handle(Character character, String request) {
        if (_nextHandler != null) {
            _nextHandler.Handle(character, request);
        }
    }
}
