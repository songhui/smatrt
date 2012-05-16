package ie.tcd.rm.test.filesys.engin;

import ie.tcd.rm.test.filesys.engin.CreateFile;
import ie.tcd.rm.test.filesys.engin.RemoveFile;
import ie.tcd.rm.test.filesys.engin.RenameFile;
import ie.tcd.test.filesys.EFile;
import ie.tcd.test.filesys.EFolder;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

public class FileChanges {
  public static EFolder getContainerByPath(final EFolder root, final String path) {
    EFolder _xblockexpression = null;
    {
      String[] _split = path.split("\\\\");
      final String[] p = _split;
      EFile f = root;
      final String[] _typeConverted_p = (String[])p;
      final String[] _typeConverted_p_1 = (String[])p;
      int _size = ((List<String>)Conversions.doWrapArray(_typeConverted_p_1)).size();
      int _operator_minus = IntegerExtensions.operator_minus(_size, 1);
      List<String> _subList = ((List<String>)Conversions.doWrapArray(_typeConverted_p)).subList(2, _operator_minus);
      for (final String frag : _subList) {
        EList _subfiles = ((EFolder) f)==null?(EList)null:((EFolder) f).getSubfiles();
        final Function1<EFile,Boolean> _function = new Function1<EFile,Boolean>() {
            public Boolean apply(final EFile e) {
              String _name = e.getName();
              boolean _operator_equals = ObjectExtensions.operator_equals(_name, frag);
              return Boolean.valueOf(_operator_equals);
            }
          };
        EFile _findFirst = IterableExtensions.<EFile>findFirst(_subfiles, _function);
        f = _findFirst;
      }
      _xblockexpression = (((EFolder) f));
    }
    return _xblockexpression;
  }
  
  public static String extractFileName(final String path) {
    int _lastIndexOf = path.lastIndexOf("\\");
    int _operator_plus = IntegerExtensions.operator_plus(_lastIndexOf, 1);
    String _substring = path.substring(_operator_plus);
    return _substring;
  }
  
  private CreateFile createFile = new CreateFile();
  
  private RenameFile renameFile = new RenameFile();
  
  private RemoveFile removeFile = new RemoveFile();
  
  public void init(final Map<String,EObject> context) {
    createFile.init(context);
    renameFile.init(context);
    removeFile.init(context);
  }
  
  public void execute(final Object event) {
    createFile.execute(event);
    renameFile.execute(event);
    removeFile.execute(event);
  }
}
