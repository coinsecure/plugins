/*
 * SWGAskID.h
 * 
 * 
 */

#ifndef SWGAskID_H_
#define SWGAskID_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGAskID: public SWGObject {
public:
    SWGAskID();
    SWGAskID(QString* json);
    virtual ~SWGAskID();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGAskID* fromJson(QString &jsonString);

    QString* getAskID();
    void setAskID(QString* askID);

private:
    QString* askID;
};

} /* namespace Swagger */

#endif /* SWGAskID_H_ */
