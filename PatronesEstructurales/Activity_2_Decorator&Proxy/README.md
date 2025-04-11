## Activity 2 - Patrones Estructurales Proxy y Decorator

Esta actividad se enfoca en los patrones de Proxy y Decorator. Ambos son patrones estructurales
que buscan la composición o agregación a clases bases durante la ejecución, pero tienen casos de
uso e implementaciones distintas.

La principal diferencia es que el patrón Decorator agrega información, pasos o alguna 
consideración adicional sobre lo que se espera regrese una clase, mientras que el proxy se hace
pasar por la propia clase, para asegurarse de que el acceso a la clase real cumple con ciertas
características, como por ejemplo de seguridad o de verificación de que su acceso sea realmente
necesario.

El patrón Decorator se puede utilizar cuando es necesario añadir cierto comportamiento a un 
componente, pero no es posible extenderlo o modificarlo directamente. Estos comportamientos 
adicionales solamente van a ser utilizados en ciertos casos, y no siempre va a ser necesario
agregar todos los comportamientos; es por esto que es mejor agregar solamente los pasos que
sean necesarios considerando las particulariadades de la solicitud durante el run time.

Por otro lado, el patrón Proxy es más útil en situaciones cuando queremos verificar la manera
en la que un cliente esta intentando interactuar con un recurso externo, antes de enviar la 
solicitud al recurso real. Esto puede incluir muchos motivos, desde autenticación y 
autorizaciones de seguridad, como reducir la carga que se pone a servicios externos por el uso
de recursos pesados; en este último caso es posible almacenar solicitudes previas en el cache 
del proxy y revisar este para llamar a los recursos desde ahí en lugar volver a hacer la 
solicitud al recurso externo.


